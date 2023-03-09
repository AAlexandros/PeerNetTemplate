# PeerNet Template
This repository includes a basic template that can be used as an initialization point for any PeerNet simulation/emulation project.
Gradle is used as the dependency management software and git as the versioning system.
A simple progress bar is included in order to allow tracking experiment progress. 

## Building the Project
Most of the dependencies are contained in the <b>build.gradle</b> file.
The dependencies that are not contained in a public repository should
be added into the <b>lib</b> folder. Three such dependencies are <b>djep</b>, 
<b>jep</b> and <b>PeerNet</b>.

To build the project you must have Gradle installed and run the 
<code>gradle build</code> command.

## Running an Experiment
Two scripts are provided in order to allow you to run experiments. 
<b>go.sh</b> should be used to run individual experiments and work.sh should be used to run multiple experiments. 