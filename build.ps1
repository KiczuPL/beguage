$ANTLR="../antlr-4.13.1-complete.jar"

function Generate {
    java -jar $ANTLR -o output LangX.g4
}

function Compile {
    javac -cp "$ANTLR;output;." Main.java
}

function Test {
    java -cp "$ANTLR;output;." Main test.x > test.ll
    lli test.ll
}

function Clean {
    Remove-Item test.ll -ErrorAction SilentlyContinue
    Remove-Item *.class -ErrorAction SilentlyContinue
    Remove-Item -Recurse -Force output -ErrorAction SilentlyContinue
}

function All {
    Generate
    Compile
    Test
}

All
