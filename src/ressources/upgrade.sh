#!/bin/bash
pass=$1
echo $pass| sudo -S apt-get upgrade
