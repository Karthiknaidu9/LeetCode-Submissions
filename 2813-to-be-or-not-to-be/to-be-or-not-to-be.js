/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    const ret = {
        toBe: function(v) {
            if (v !== val) {
                throw new Error("Not Equal");
            }
            return true;  
        },
        notToBe: function(v) {
            if (v === val) {
                throw new Error("Equal");
            }
            return true;  // if they are not equal
        }
    }
    return ret;
};


/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */