class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int pivotIndex = partition(nums, left, right);

            if (pivotIndex == target) {
                return nums[pivotIndex];
            }

            if (pivotIndex < target) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }

        return -1;
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int index = left;

        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }

        int temp = nums[index];
        nums[index] = nums[right];
        nums[right] = temp;

        return index;
    }
}