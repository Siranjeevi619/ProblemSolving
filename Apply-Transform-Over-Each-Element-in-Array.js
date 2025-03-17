/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const returnArray = [] ;
    for(let i = 0  ; i < arr.length; i+=1){
        returnArray[i] = fn(arr[i], i);
    }
    return returnArray;
};