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

    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {

    }

    public static void main(String[] args) {
        System.out.println ("just artifact");
    }
}
