/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let res = [];
    arr.forEach((val,i)=>{
        if(fn(val,i)){
            res.push(arr[i]);
        }
    });
    return res;
};