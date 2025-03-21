class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n=nums.size();
        map<int,int>mp;
        int res;
        for(int num:nums){
            mp[num]++;
            if(mp[num]>=n/2 && mp[res]<mp[num]){
                res=num;
            }
        }
        return res;
    }
};