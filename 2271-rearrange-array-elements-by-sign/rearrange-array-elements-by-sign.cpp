class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int pos=0;
        int neg=1;
        vector<int>res(nums.size());
        for(int i=0;i<nums.size();i++){
            if(nums[i]<0){
                res[neg]=nums[i];
                neg+=2;
            }else{
                res[pos]=nums[i];
                pos+=2;
            }
        }
        return res;
    }
};