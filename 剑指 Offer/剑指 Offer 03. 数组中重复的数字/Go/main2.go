func findRepeatNumber(nums []int) int {
    sort.Ints(nums)
   lastNum :=nums[0]
   for _,num :=range nums[1:]{
       if lastNum==num{
           break
       }else{
           lastNum=num//把值赋值给laskNum让它和下一位相比较
       }
   }
   return lastNum
}