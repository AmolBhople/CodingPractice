package ab.techstack.coding.problems.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeTwoSortedListsTest {

    MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
    @Test
    void mergeTwoLists() {
        int[] arr1 = {1,1,3,6,9,19};
        int[] arr2 = {3,4,6,7,8};
        ListNode construct = construct(arr1);
        assertNotNull(construct);
    }

    @ParameterizedTest
    @MethodSource("nodeProvider")
    void mergeTwoLists1(ListNode node1, ListNode node2) {
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(node1, node2);
        assertNotNull(listNode);
    }

    static Stream<Arguments> nodeProvider() {
        int[] arr1 = {1,1,3,6,9,19};
        int[] arr2 = {3,4,6,7,8};
        return Stream.of(
                arguments(MergeTwoSortedListsTest.construct(arr1), MergeTwoSortedListsTest.construct(arr2))
        );
    }

    @ParameterizedTest
    @MethodSource("nodeProvider2")
    void mergeTwoLists2(ListNode node1, ListNode node2) {
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(node1, node2);
        assertNotNull(listNode);
    }

    static Stream<Arguments> nodeProvider2() {
        int[] arr1 = {};
        int[] arr2 = {};
        return Stream.of(
                arguments(MergeTwoSortedListsTest.construct(arr1), MergeTwoSortedListsTest.construct(arr2))
        );
    }


    private static ListNode construct(int[] arr){
        ListNode head = null;
        ListNode temp = null;
        if(arr.length == 0)
            return null;
        else{
            for (int i: arr) {
                if(head == null){
                    ListNode node = new ListNode(i,null);
                    temp = node;
                    head = node;
                }else{
                    ListNode node = new ListNode(i,null);
                    temp.next=node;
                    temp = node;
                }
            }
        }
            return head;
    }

}