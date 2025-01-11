/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let curr = init;
    const ret = {
        increment: function() {
            return ++curr;
        },
        decrement: function() {
            return --curr;
        },
        reset: function() {
            curr = init;
            return curr;
        }
    };
    return ret; 
};


/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */