package com.gome.mapred;

import org.apache.hadoop.io.Writable;
import sun.applet.Main;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * @author zzy
 * @create 2022-07-30-23:27
 */
public class PhoneBean implements Writable {
    @Override
    public void write(DataOutput dataOutput) throws IOException {
        System.out.println ("the dev branch");
        System.out.println ("git merge with conflict");
        System.out.println ("git merge resolve");
        System.out.println ("git branch -a -r ");
        System.out.println ("git merge conflict with git commit");
        System.out.println ("use git merge from sourceTree");
        System.out.println ("use sourceTree merge branch");

        System.out.println ("use the fast-forward");

        System.out.println ("hotfix use the fast-forward");
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {

    }

    public static void main(String[] args) {
        System.out.println ("just artifact");
    }
}
