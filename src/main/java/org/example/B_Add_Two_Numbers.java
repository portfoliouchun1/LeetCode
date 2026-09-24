package org.example;

public class B_Add_Two_Numbers {

}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // natijaviy royxat uchun sohta boshlangich tugun
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0; // dildagi son (yodda saqlanadigani)

        // l1 yoki l2 da element borligicha, yoki dilda son qolgancha davom etadi
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // oldingi bosqichdan qolgan dildagi sonni qo'shamiz

            // Agar l1 tugamagan bolsa, qiymatini qoshamiz va oldinga suramiz
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Agar l2 tugamagan bolsa, qiymatini qoshamiz va oldinga suramiz
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // sveji dildagi sonni hisoblaymiz (masalan, 13 / 10 = 1)
            carry = sum / 10;

            // hozirgi xonaga yoziladigan raqamni aniqlaymiz (masalan, 13 % 10 = 3)
            curr.next = new ListNode(sum % 10);

            // Ko'rsatkichni yangi yaratilgan tugunga suramiz
            curr = curr.next;
        }

        // dummyHead uzi 0 edi, uning keyingi elementi haqiqiy natijaning boshi boladi
        return dummyHead.next;
    }
}

