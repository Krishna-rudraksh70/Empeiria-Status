/**
 * @param {number[]} arr
 * @return {boolean}
 */
 var uniqueOccurrences = function(arr) {
    let numObj = {};
    for (let num of arr) {
        if (numObj[num]) {
            numObj[num] = numObj[num] + 1;
        } else {
            numObj[num] = 1;
        }
    }
    let valuesArr = Object.values(numObj).sort();
    let j = 0;
    for (let i = 1; i < valuesArr.length; i++) {
        if (valuesArr[j] === valuesArr[i]) {
            return false;
        }
        j++;
    }
    return true;
};