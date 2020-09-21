package org.example.test;

import org.example.app.App;

public class Test {

    public static void main(String[] args) throws Exception {
        App app = new App("/Users/malcolmfeng/Documents/code/mine/Decomplier-Maven/src/main/java/org/example/test/","FileClass");
        app.doDecomplie();
    }
}
