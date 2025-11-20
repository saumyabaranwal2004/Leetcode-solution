class Solution {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {
        vector<int> ans;
        int p = num.size() - 1;
        int carry = 0;

        while (p >= 0 || k > 0 || carry > 0) {
            int numVal = 0;
            if (p >= 0) {
                numVal = num[p];
                p--;
            }

            int d = k % 10;
            int sum = numVal + d + carry;
            ans.push_back(sum % 10);
            carry = sum / 10;

            k /= 10;
        }

        reverse(ans.begin(), ans.end());
        return ans;
    }
};
