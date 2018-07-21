#!/bin/bash
read dir

if [ ! -d "$dir" ] 
then
   mkdir ./$dir
   echo "Dir created"
else
   echo "Dir already exists"
fi
