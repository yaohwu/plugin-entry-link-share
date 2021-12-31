#!/bin/zsh

projectPath=$(pwd)
outputPath=${projectPath}"/WEB-INF/plugins/plugin-xyz.yaohwu.plugin.els-1.0.0"

echo "$projectPath"
echo "$outputPath"

mvn clean package -Dmaven.test.skip=true -DprojectPath="$projectPath" -DoutputPath="$outputPath"
