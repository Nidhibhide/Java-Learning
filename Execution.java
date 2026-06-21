//1.in java execution 
// FileName.java
//     ↓
// javac FileName.java ( compiler )
//     ↓
// FileName.class (Bytecode)
//     ↓
// java FileName
//     ↓
// Interpreter + JIT compiler 
//     ↓
// Machine Code
//     ↓
// CPU Executes

//2.in node js execution 
// FileName.js
//     ↓
// node FileName.js
//     ↓
// V8 Engine (Interpreter + JIT Compiler)
//     ↓
// Machine Code
//     ↓
// CPU Executes

//Compiler - Converts the entire program into machine code at once before execution.
//Interpreter - Converts code line by line into bytecode (intermediate code ), executes it, then moves to the next line.
//JIT compiler - JIT identifies repeated code and converts it into machine code at runtime for faster execution. 

//configuration diff , set path env  - 
//1.Java installations required manual PATH configuration (especially older setups).
//2.Node.js installers configure PATH automatically.

//WORA - write once run anywhere  

//JDK - JRE + development tools (compiler, debugger)
//JRE - JVM + libraries
//JVM - executes Java bytecode

//java is platform independent - Java code is compiled into bytecode, and the same bytecode can run on any operating system that has a JVM (WORA)

//jvm is platform dependent - JVM is platform dependent because each operating system requires its own JVM. ex - Windows → Windows JVM , Linux → Linux JVM

//Bytecode is platform-independent - Bytecode can run on any operating system that has a JVM


//java follows 'UNICODE' for char datatypes which consist of multiple languages 

//we can use in java like 100_00_00 to seperate out no  

//conversion from int to byte its explicit conversion called as casting ex - byte(int_variable)