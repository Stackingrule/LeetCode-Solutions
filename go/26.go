func removeDuplicates(nums []int) int {
	n := len(nums)
	i := 0
	for j := 1; j < n; j++ {
		if nums[i] != nums[j] {
			nums[i+1] = nums[j]
		}
	} 
	return i + 1
    
}