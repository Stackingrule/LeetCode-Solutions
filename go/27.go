func removeElement(nums []int, val int) int {
	n := len(nums)
    index := 0
	for i := 0; i < n; i++ {
		if nums[i] != val {
			nums[index] = nums[i]
            index++
		}
	}
    return index
}