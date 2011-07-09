# Simple Punchcard App
A Reddit-powered open-source Android app.

## Goal

From the reddit thread:

* Record my in/out time in a very simple, user-friendly way.
* Break down my average hourly earning based on my salary. Have this average update automatically as I record my time each day.
* Email me my timesheet weekly with a breakdown of the hours, hourly average, and possibly the daily job description.

## Project Suggestions
* Don't push untested code to the master branch-- create a feature branch for extended work on a specific item and then merge back to master when it seems to be good
* Squash (rebase) local commits ONLY. Use this to tiddy up before merging back to master if you have messy commits
* Only edit docs on the master branch

## Development Suggestions

* Subclass the Application class and keep all global logic, state, and data there
* Activity classes should only contain UI logic and interface with the underlying Application or other data/model objects
* Do as much UI design as possible via XML and inflate the layout/resource in the code

## Application Design
It's probably simpliest to implement some sort of SQLite database to store punch in and punch out times, then query that database to get the info such as hourly avery for the week, past 2 weeks, etc. 

### Classes

### User Interface

### Settings

### Graphical Assets


