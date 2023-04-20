Feature: Homework
@wipp
Scenario: positive double click
Given : Navigate to: https://testautomationpractice.blogspot.com
When : Double click on the Copy Text button
And : Get text from the dropdown 2
Then : Navigate to: http://api.jquery.com/dblclick/
And : Switch to the frame that has blue box
And : Double click the box to turn it into yellow
Then : Verify the box is y