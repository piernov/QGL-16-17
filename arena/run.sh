#!/bin/bash
mkdir -p championships/_retro_qgl_1
mvn -q clean compile exec:exec -Dexec.executable="java" -Dexec.args="-cp \"%classpath\" retrospective.FirstSemester" | tee championships/_retro_qgl_1/README.md
mkdir -p championships/_retro_qgl_2
mvn -q clean compile exec:exec -Dexec.executable="java" -Dexec.args="-cp \"%classpath\" retrospective.SecondSemester" | tee championships/_retro_qgl_2/README.md
