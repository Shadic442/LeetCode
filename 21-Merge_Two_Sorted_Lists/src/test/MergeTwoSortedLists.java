package test;

import java.util.ArrayList;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);
		System.out.println("List 1 : ");
		printList(list1);
		
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);
		System.out.println("List 2 : ");
		printList(list2);
	}

	/**
	 * Definition for singly-linked list.
	 */
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		return list2;

	}
	
	static void printList(ListNode current) {
		while (current != null) {
			System.out.println(current.val);
			if (current.next != null) {
				System.out.println(" ");
			}
			current = current.next;
		}
		System.out.println();
	}
}
