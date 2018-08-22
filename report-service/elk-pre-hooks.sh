#!/usr/bin/env bash
cat << EOF >> /etc/default/elasticsearch
MY_CUSTOM_VAR=$MY_CUSTOM_VAR
export MY_CUSTOM_VAR 
EOF