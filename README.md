android text messaging Examples
===========
eclipse/ has the examples in eclipse project format, no longer updated.  Otherwise the examples are for android studio.


smsDemo is a simple app to send and receive sms messages.  The code has been tested on android 4.4 and 5.0.1.  It works.
  It does not attempt to be a default sms provider.  The sms are sent via an intent and the default sms provider will
   have a copy of the message as well, but default provider doesn't require user intervention .

smsDemo2 sends binary sms messages.  Untested in 4.4+

mmsDemo is a hack to send mms messages for devices prior to android 4.4.  Messenger comes up and the user
  is required to press the send button in order to make it work.  A default sms provider required to send and receive mms 4.4+
   or just use the content provider to read the mms messages.


These are example code for University of Wyoming, Cosc 4730 Mobile Programming course.
All examples are for Android.
