import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName:TextDemo2
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/5/8 22:59
 */
public class TextDemo2 {
    //面试题 02.01. 移除重复节点
//    public ListNode removeDuplicateNodes(ListNode head) {
//        if(head == null) return null;
//        ListNode cur = head;
//        HashSet<Integer> set = new HashSet<>();
//        set.add(head.val);
//        while(cur.next != null) {
//            ListNode curNext = cur.next;
//            if(set.contains(curNext.val)) {
//                cur.next = cur.next.next;
//            } else {
//                set.add(curNext.val);
//                cur = curNext;
//            }
//        }
//        return head;
//    }

    //汽水瓶
//    public static int getWaterBottle(int n) {
//        int water = 0;
//        while(n / 3 != 0) {
//            int tmp = n / 3;
//            water += tmp;
//            n = tmp + n % 3;
//        }
//        if(n == 2) water += 1;
//        return water;
//    }

    
    //查找两个字符串a,b中的最长公共子串
//    public static String getRepeatString(String s1,String s2) {
//        String result = "";
//        int len = 0;
//        String max = s1.length() > s2.length() ? s1 : s2;
//        String min = s1.length() > s2.length() ? s2 : s1;
//        for(int i = 0; i < min.length(); i++) {
//            for(int j = i + 1; j < min.length(); j++) {
//                if(max.contains(min.substring(i,j)) && (j - i > len)) {
//                    len = j - i;
//                    result = min.substring(i,j);
//                }
//            }
//        }
//        return result;
//    }

    //剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root == null) return null;
//        if(root == p || root == q) return root;
//        TreeNode cur = root;
//        while(true) {
//            if(p.val < cur.val && q.val < cur.val) {
//                cur = cur.left;
//            } else if(p.val > cur.val && q.val > cur.val) {
//                cur = cur.right;
//            } else {
//                break;
//            }
//        }
//        return cur;
//    }

    //删除有序数组中的重复项
//    public int removeDuplicates(int[] nums) {
//        if(nums == null || nums.length == 1) return nums.length;
//        int i = 0, j = 1;
//        while(j < nums.length) {
//            if(nums[i] == nums[j]) {
//                j++;
//            } else {
//                i++;
//                nums[i] = nums[j];
//                j++;
//            }
//        }
//        return i + 1;
//    }

    //面试题 16.17. 连续数列
//    public int maxSubArray(int[] nums) {
//        if(nums == null || nums.length == 0) return 0;
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        int sum = nums[0];
//        for(int i = 1; i < nums.length; i++) {
//            dp[i] = Math.max(nums[i] + dp[i - 1],nums[i]);
//            sum = Math.max(dp[i],sum);
//        }
//        return sum;
//    }

    //公共字串计算
//    public static int getComStrLen(String s1,String s2) {
//        if(s1 == null || s2 == null) return 0;
//        String max = s1.length() > s2.length() ? s1 : s2;
//        String min = s1.length() > s2.length() ? s2 : s1;
//        int len = 0;
//        for(int i = 0; i < min.length(); i++) {
//            for(int j = i + 1; j < min.length(); j++) {
//                if(max.contains(min.substring(i,j)) && j - i > len) {
//                    len = j - i;
//                }
//            }
//        }
//        return len;
//    }
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String s = sc.nextLine();
//            StringBuilder sb = new StringBuilder();
//            for(int i = s.length() - 1; i >= 0; i--) {
//                sb.append(s.charAt(i));
//            }
//            String str = sb.toString();
//            System.out.println(str);
//
//        }
//        int[] arr = {1,1,2};
//        System.out.println(removeDuplicates(arr));
//        int n = 0;
//        System.out.println(getWaterBottle(n));

    }
}
