package sort;

/**
 * 922. 按奇偶排序数组 II
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 *
 *
 * 示例：
 *
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *
 *
 * 提示：
 *
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 * @author songyongshuo
 * @date 2020-12-29 13:29
 */
public class _922_SortArrayByParityII {
    public int[] sortArrayByParityII(int[] a) {
        int[] result = new int[a.length];
        int x = 0;
        int y = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                result[x] = a[i];
                x += 2;
            } else {
                result[y] = a[i];
                y += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] ints = new _922_SortArrayByParityII().sortArrayByParityII(new int[]{1, 2, 3, 4});
        for (int a : ints) {
            System.out.println(a);
        }
    }
}
