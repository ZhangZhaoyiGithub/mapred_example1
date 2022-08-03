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
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {

    }

    public static void main(String[] args) {
        System.out.println ("just artifact");
    }
}
