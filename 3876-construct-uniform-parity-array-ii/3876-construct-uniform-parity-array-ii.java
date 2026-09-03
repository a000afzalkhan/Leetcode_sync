class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
int even = 0;
int odd = 0;

// Sabse chhote numbers store karne ke liye variables (shuru mein sabse badi value maante hain)
int minEven = Integer.MAX_VALUE;
int minOdd = Integer.MAX_VALUE;

// Ek hi loop mein sab kuch count aur find kar lenge
for (int i = 0; i < n; i++) {
    int currentNumber = nums1[i];
    
    if (currentNumber % 2 == 0) { // Agar Even hai
        even++;
        if (currentNumber < minEven) {
            minEven = currentNumber; // Sabse chhota Even update karo
        }
    } else {                      // Agar Odd hai
        odd++;
        if (currentNumber < minOdd) {
            minOdd = currentNumber; // Sabse chhota Odd update karo
        }
    }
}

// Check 1: Agar poora array pehle se Even ya Odd hai (Aapka logic bilkul sahi tha yahan)
if (even == n || odd == n) {
    return true;
}

// Check 2: Agar array mix hai, toh chhota Odd number, chhote Even se chhota hona chahiye
if (minOdd < minEven) {
    return true;
} else {
    return false;
}
    }
}