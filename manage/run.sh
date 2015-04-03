#!/bin/bash

cd ..

nohup /opt/bea/bea1033/jdk1.6.0_20/bin/java \
-Dci_att \
-jar target/ci_att-1.0-SNAPSHOT.jar &
