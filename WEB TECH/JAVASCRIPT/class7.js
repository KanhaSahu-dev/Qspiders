//! replace() - only first word replaced

//! replaceAll() - all the words


// let str = "yo bo yo bo yo bo"

// str = str.replace("bo","do");

// console.log(str);

//! padStart() and padEnd() are both ES6 features

// let num = "1234"
// console.log(num.padStart(10,"X"));

//! substring()

// let str = "hello girl i am ur boy."
// console.log(str.split(null));

// substring()

// let str = "yo baby";
// console.log(str.substring(0,2));

//! substr() It is deprecated that is not used it is not error

// let str = "haha u r mine";
// console.log(str.substr(-5,2));

// index in reverse -1 , -2, -3, -4, -5.

//! charcodeAt
// If we want to know the ascii at the particular index

// str1 = "hii"
// str2 = "baby"

//! concat()

// console.log(str1.concat(str2));

// let str = "abcd"

// console.log(str.toUpperCase());
// console.log(str.toLowerCase());

//todo Differences between substring() and slice()?

// The substring() method swaps its two arguments if indexStart is greater than indexEnd , meaning that a string is still returned. The slice() method returns an empty string if this is the case.


//~ Array in Javascripts

//! push() unshift()

//! pop() shift()

// let str = "hello baby how are you"
// str = str.split(" ")
// console.log(str);
// let temp=[];
// for(i of str){
//     if(i=="baby")
//     continue;
// temp.push(i);
// }
// str = temp.join(" ")
// console.log(str);

//! indexOf()

//! includes() whther check if it is included in the array.

//! splice() affects the original array.
//! slice() does not affects the original array.
//! substring() directly returns the word which is mentioned.

// splice() not only have 2 arguments we can also have 3 arguments where if we add the 3rd element then it gets added to the original Array.

//splice() is mainly used to remove the middle element in the array.

// let wife_list = ["perry"]
// let crush_list = ["cherry"]

// wife_list=wife_list.concat(crush_list)
// console.log(wife_list);

//todo difference between toString and join?

//! reverse()

//! Array.from()

//todo difference between split() and Array.from()

// let str ="yoyoyoy"
// console.log(Array.from(str));

// reverse a string

