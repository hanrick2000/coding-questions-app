package com.playground;

import java.util.Arrays;
import java.lang.Iterable;
import java.util.Deque;
import java.util.List;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.codingquestions.app.util.TreeNode;
import com.codingquestions.app.util.PersonEnum;
import com.codingquestions.app.util.RainbowColorEnum;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Queue;
import java.lang.Comparable;
import java.util.PriorityQueue;
import java.lang.StringBuilder;
import java.util.HashMap;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.playground.Person;
import com.playground.Employee;
import com.playground.MyAbstractClass;
import java.lang.ArithmeticException;
import java.io.IOException;
import java.lang.AbstractMethodError;
import java.lang.Exception;
import java.lang.RuntimeException;

public class PlayGround<E extends Object & Comparable<E> & Iterable<E>> {

    public static void test(List<String> list) {
        list.add("charlie");

    }

    public static void main(String[] args) throws Exception, IOException {
        List<List<Integer>> test = new ArrayList<>();
        test.add(Arrays.asList(1, 2, 3, 4));
        for (int each : test.get(0)) {
            System.out.println(each);
        }
    }
}
