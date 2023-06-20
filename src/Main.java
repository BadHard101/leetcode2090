import java.util.Arrays;

class Main {
    public static int[] getAverages(int[] nums, int k) {
        int[] avg = new int[nums.length];
        Arrays.fill(avg, -1);
        int avgDel = 2 * k + 1;
        long temp_sum = 0;
        long avgSum;

        if (2 * k < nums.length) {
            for (int j = 0; j <= 2 * k; j++) {
                temp_sum += nums[j];
            }
        } else {
            return avg;
        }
        avgSum = temp_sum / avgDel;
        avg[k] = (int) avgSum;

        for (int i = k + 1; i < nums.length - k; i++) {

            temp_sum -= nums[i - k - 1];
            temp_sum += nums[i + k];

            avgSum = temp_sum / avgDel;
            avg[i] = (int) avgSum;
        }
        return avg;
    }

    public static void main(String[] args) {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        int[] nums1 = {100000};
        int[] nums2 = {8};
        int[] nums3 = {8, 2, 4, 2, 4};
        int k = 3;
        int k1 = 0;
        int k2 = 100000;
        int k3 = 1;

        System.out.println(Arrays.toString(getAverages(nums3, k3)));
    }
}