class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int num = 0;
        while(n != 1){
            while(n > 0){
                int rem = n % 10;
                num += Math.pow(rem, 2);
                n /= 10;
            }
            n = num;
            num = 0;

            // If n is already in the set, it means we are in a cycle
            if (seen.contains(n)) {
                return false;
            }

            // Add the current number to the set of seen numbers
            seen.add(n);
        }
        return true;
    }
}