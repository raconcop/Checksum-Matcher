# Checksum-Matcher
A small program where you input two checksums and see if they match
This is important when you are downloading programs and are not sure if the download has been tampered.
The hashing insures that the program you have downloaded is reputable and the intended files the provider has.
Always do a check on the hash when you are downloading a large file, program that uses system commands or anything suspicous. 

Open the command prompt



# For the MD5 checksum:

cd into the folder that holds the file you want to checksum

certutil -hashfile <file> MD5

# For the SHA256 checksum:

certutil -hashfile C:\Users\user1\Downloads\software.zip SHA256


replace <file> with filename

Press Enter


Copy the MD5 checksum from the provider and cmd prompt and check if they match.

If they do then your download went through properly.
