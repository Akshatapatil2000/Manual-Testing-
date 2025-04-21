# Manual-Testing-
Sign-Up Flow Manual Testing
Fields to Test:
Full Name

Email Address

Password

Confirm Password

"Sign Up" button

Test Cases:

Test Case ID	Description	Input	Expected Result
TC001	Submit empty form	(blank)	Show validation errors
TC002	Invalid email format	user@wrong	Show "Invalid email" message
TC003	Password mismatch	pass123 / pass321	Show "Passwords do not match"
TC004	Weak password	123	Show "Password too weak"
TC005	Valid signup	All fields correct	Redirect to OTP screen
 Bugs to Watch For:
Password field not masked

Form submits even with invalid data

Duplicate email signup allowed without error

Manual Test Steps:
Go to the Sign-Up page.

Try submitting without filling anything.

Enter an invalid email (abc@), submit.

Enter mismatched passwords, submit.

Try weak password like 123, expect rejection.

Enter valid name, email, strong password, matching confirm password — expect redirect to OTP.

 2. OTP Verification Testing
Fields to Test:
6-digit OTP input field(s)

"Verify OTP" button

"Resend OTP" link/button

Test Cases:

Test Case ID	Description	Input	Expected Result
TC006	Submit empty OTP	(blank)	Show "OTP required"
TC007	Invalid OTP (wrong digits)	123456	Show "Incorrect OTP"
TC008	Expired OTP	Wait 5+ min	Show "OTP expired"
TC009	Valid OTP	(correct 6-digit code)	Signup success / redirect to login
 Bugs to Watch For:
OTP field accepts letters

Paste into OTP breaks format

Resend OTP button not working or too frequent

 Manual Test Steps:
After signup, check if you're prompted for OTP.

Submit blank — error should appear.

Try invalid OTP (000000) — check for rejection.

Try expired OTP (wait or simulate) — should show expiry message.

Enter correct OTP — success and move to dashboard or login.

3. Login Flow Manual Testing
 Fields to Test:
Email

Password

"Login" button

"Forgot Password?" link

 Test Cases:

Test Case ID	Description	Input	Expected Result
TC010	Submit blank form	(blank)	Show "required" errors
TC011	Wrong email	wrong@example.com	Show "User not found"
TC012	Wrong password	correct@email / wrongpass	Show "Incorrect password"
TC013	Valid login	Correct email/pass	Redirect to dashboard
TC014	SQL injection	' OR 1=1 --	Reject input (no security breach)
 Bugs to Watch For:
Login form bypassable

Error messages too specific ("wrong password" vs. "wrong user")

SQL injection not sanitized

Login doesn’t redirect or fails silently
