//package AA;
//
//import java.util.*;
//
//class Solution2{
//    private static class Pair {
//        int first, second;
//        Pair(int first, int second) {
//            this.first = first;
//            this.second = second;
//        }
//    }
//
//    private int upperBound(List<Pair> nums, int target) {
//        int s = 0, e = nums.size() - 1, ans = e + 1;
//        while (s <= e) {
//            int mid = s + (e - s) / 2;
//            if (nums.get(mid).first > target) {
//                ans = mid;
//                e = mid - 1;
//            } else {
//                s = mid + 1;
//            }
//        }
//        return ans;
//    }
//
//    private long solve(List<Pair> nums, int idx) {
//        int n = nums.size();
//        if (idx >= n) return 0;
//
//        if (dp[idx] != -1) return dp[idx];
//
//        long notTake = solve(nums, idx + 1);
//
//        int k = upperBound(nums, nums.get(idx).first + 2);
//        long take = (long)nums.get(idx).first * nums.get(idx).second + solve(nums, k);
//
//        return dp[idx] = Math.max(take, notTake);
//    }
//
//    private Map<Integer, Long> freq = new HashMap<>();
//    private long[] dp;
//
//    public long maximumTotalDamage(int[] power) {
//        for (int it : power) {
//            freq.put(it, freq.getOrDefault(it, 0L) + 1);
//        }
//
//        List<Pair> nums = new ArrayList<>();
//        for (Map.Entry<Integer, Long> it : freq.entrySet()) {
//            nums.add(new Pair(it.getKey(), it.getValue().intValue()));
//        }
//        nums.sort(Comparator.comparingInt(a -> a.first));
//
//        int m = nums.size();
//        dp = new long[m];
//        Arrays.fill(dp, -1);
//
//        return solve(nums, 0);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] power = new int[n];
//        for (int i = 0; i < n; i++) {
//            power[i] = scanner.nextInt();
//        }
//        scanner.close();
//
//        Solution solution = new Solution();
//        long result = solution.maximumTotalDamage(power);
//        System.out.println(result);
//    }
//}
