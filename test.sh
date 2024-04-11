#!/bin/bash

java -jar out/artifacts/beguage_jar/beguage.jar be1.be > program.ll
llvm-as -o program.bc program.ll && llc -o program.s program.bc && clang -o program program.s
./program