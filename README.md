# Word-Composition-Problem
The Word Composition Problem involves finding the longest and second-longest "compounded" words from a list of alphabetically sorted words. A compounded word is defined as a word that can be constructed by concatenating shorter words from the same list. The program reads the input words, identifies the compounded words, and displays the results along with the time taken for processing.

## Run and Debug
Download the wordCompositionProblem file. Then,
Open Command Line.
```sh
javac wordCompositionProblem.java
```
It will create a wordCompositionProblem java class file. After that 

```sh
java wordCompositionProblem
```
It will run the class file and input the data.

## Approach
Input Handling:
  Read the input words into a collection (e.g., Set<String>)

Sorting:
  Sort the words by length in descending order. This ensures that longer words are checked first.
  
Finding Compound words;
  Use a helper function to split the word into prefixes and suffixes.

Output:
  Print the longest compounded word, the second-longest compounded word, and the time taken for processing.

