# My version of the Email App Grid Layout!
This application sends an email to a specified address with a specified Subject and Message. It utilizes an intent that will go to an activity selected by the user.

This application was based off of the "Contact the Developer" activity in my own Breast Cancer Awareness Application

##Problem
To design an application that can send e-mails to anyone's email address.

##Solution
Once the values in the views have been converted to a String, the code below may be applied:

```
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[] {target});
        i.putExtra(Intent.EXTRA_SUBJECT, subject);
        i.putExtra(Intent.EXTRA_TEXT, message);

        Toast.makeText(this, "trying intent", Toast.LENGTH_SHORT).show();
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
```

##Screenshots
![alt tag](https://github.com/KristoffRey/EmailAppGridLayout/blob/master/Screenshot_2015-10-26-10-01-53.png)
![alt tag](https://github.com/KristoffRey/EmailAppGridLayout/blob/master/Screenshot_2015-10-26-10-01-57.png)
