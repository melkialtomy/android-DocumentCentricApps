@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_new_document);
    documentCount = getIntent()
            .getIntExtra(DocumentCentricActivity.KEY_EXTRA_NEW_DOCUMENT_COUNTER, 0);
    documentCounterTextView = (TextView) findViewById(
            R.id.hello_new_document_text_view);
    setDocumentCounterText(R.string.hello_new_document_counter);
}

@Override
protected void onNewIntent(Intent intent) {
    super.onNewIntent(intent);
    /* If FLAG_ACTIVITY_MULTIPLE_TASK has not been used, this activity
    is reused to create a new document.
     */
    setDocumentCounterText(R.string.reusing_document_counter);
}
