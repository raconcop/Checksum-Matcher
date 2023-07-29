# Checksum-Matcher
A small program where you input two checksums and see if they match


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
