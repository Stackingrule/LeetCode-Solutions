func findRepeatNumber(nums []int) int {
    for index,num:=range nums{
        if index==num{
            continue
        }
        if nums[num]==num{
            return num
        }
        nums[num],nums[index] = nums[index],nums[num]
    }
    return 0
}
