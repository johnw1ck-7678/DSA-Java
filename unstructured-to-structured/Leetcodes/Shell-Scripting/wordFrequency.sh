# Read from the file words.txt and output the word frequency list to stdout.

cat "words.txt" | tr -s ' ' '\n' | sort | uniq -c | sort -r | awk '{ print $2,$1 }'

# cat show content in the file
# tr -s ' ' '\n'  means truncate the string with removal of extra spacing
# sort sorting in order
# uniq -c means unique elements and -c count there appearance
# sort -r means sort them back to reverse order
# awk prints words and their frequency in columns format 
