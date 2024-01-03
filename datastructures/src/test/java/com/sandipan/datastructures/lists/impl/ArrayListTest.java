package com.sandipan.datastructures.lists.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArrayListTest {

    @Test
    public void testArrayListInstantiationWithoutCapacityArgument() {

        ArrayList<String> list = new ArrayList<>();
    }

    @Test
    public void testArrayListInstantiationWithCapacityArgument() {
        ArrayList<String> list = new ArrayList<>(25);
    }

}
