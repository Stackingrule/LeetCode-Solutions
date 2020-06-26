func findRepeatNumber(nums []int) int {
    maps := make(map[int]bool)
    for _,num:=range nums{
        if maps[num]{
            return num
        }else{
            maps[num]=true
        }
    }
    return -1
}