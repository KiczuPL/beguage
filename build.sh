#!/bin/bash

java -jar out/artifacts/beguage_jar/beguage.jar $1 > program.ll
if [[ $? -eq 0 ]]; then
  llvm-as -o program.bc program.ll && llc -o program.s program.bc && clang -o program program.s
  ./program
fi
  rm program.ll program.bc program.s
