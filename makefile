# makefile for use in developing Android applications 
# Brandon Valosek 2011

# app info
APPNAME=punchcard
NAMESPACE=com.punchcard
START_ACTIVITY=ui.PunchActivity

# keystore info, only needed if signing a release version of the app
KEYSTORE=../keystore/my-release-key.keystore
KEY_ALIAS=my-keystore

# default target is to install the debug APK on whatever device/emu
# we currently have
all : build-debug install-debug

# clean bin and gen
clean :
	ant clean

# build APK and sign with debug key
build-debug :
	ant -q -e debug

# push the debug APK to the emulator or phone and run it
install-debug :
	adb install -rt bin/$(APPNAME)-debug.apk
	adb shell am start -a android.intent.action.MAIN \
		-n $(NAMESPACE)/$(NAMESPACE).$(START_ACTIVITY)

# create the release APK
build-release :
	ant release
	jarsigner -verbose -keystore $(KEYSTORE) \
		bin/$(APPNAME)-unsigned.apk $(KEY_ALIAS)
	mv bin/$(APPNAME)-unsigned.apk bin/$(APPNAME)-unaligned.apk
	jarsigner -verify -verbose -certs bin/$(APPNAME)-unaligned.apk
	zipalign -vf 4 bin/$(APPNAME)-unaligned.apk bin/$(APPNAME).apk

# install release APK on the first devices available on adb
install-release :
	adb uninstall $(NAMESPACE)
	adb install -rt bin/$(APPNAME).apk
	adb shell am start -a android.intent.action.MAIN \
		-n $(NAMESPACE)/$(NAMESPACE).$(START_ACTIVITY)

