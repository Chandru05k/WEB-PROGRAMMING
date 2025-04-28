    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    var firstNumber=0;
    var secondNumber=0;
    var res=0;
    var isadd:Boolean=false
    var issub:Boolean=false
    var ismul:Boolean=false
    var isdiv:Boolean=false
    var ismod:Boolean=false


    fun perclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output.isNotEmpty()){
            firstNumber=output.toInt()
            ismod=true
            textView.text="0"
        }
    }
    fun ceclicked(view: View) {}
    fun clearclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        textView.text = "0"

    }
    fun backclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output.length==1){
            textView.text="0"
        }
        else{
            textView.text=output.substring(0,output.length-1)
        }

    }
    fun sevenclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "7"
        }
        else {
            textView.text = output + "7"
        }
    }
    fun eightclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "8"
        }
        else {
            textView.text = output + "8"
        }
    }
    fun nineclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "9"
        }
        else {
            textView.text = output + "9"
        }
    }
    fun divclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output.isNotEmpty()){
            firstNumber=output.toInt()
            isdiv  =true
            textView.text="0"
        }
    }
    fun fourclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "4"
        }
        else {
            textView.text = output + "4"
        }
    }
    fun fiveclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "5"
        }
        else {
            textView.text = output + "5"
        }
    }
    fun sixclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "6"
        }
        else {
            textView.text = output + "6"
        }
    }
    fun mulclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output.isNotEmpty()){
            firstNumber=output.toInt()
            ismul=true
            textView.text="0"
        }
    }
    fun oneclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "1"
        }
        else {
            textView.text = output + "1"
        }
    }
    fun twoclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "2"
        }
        else {
            textView.text = output + "2"
        }
    }
    fun threeclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "3"
        }
        else {
            textView.text = output + "3"
        }
    }
    fun subclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output.isNotEmpty()){
            firstNumber=output.toInt();
            issub=true
            textView.text="0"
        }
    }
    fun equalclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        secondNumber=textView.text.toString().toInt();
        if(isadd){
            res= (firstNumber+secondNumber).toInt()
            textView.text=res.toString()
            isadd=false

        }
        if(issub){
            res= (firstNumber-secondNumber).toInt()
            textView.text=res.toString()
            issub=false
        }
        if(ismul){
            res= (firstNumber*secondNumber).toInt()
            textView.text=res.toString()
            ismul=false
        }
        if(isdiv){
            res= (firstNumber/secondNumber).toInt()
            textView.text=res.toString()
            isdiv=false
        }
        if(ismod){
            res= (firstNumber%secondNumber).toInt()
            textView.text=res.toString()
            ismod=false
        }
        firstNumber=res;
        secondNumber=0;
    }
    fun zeroclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "0"
        }
        else {
            textView.text = output + "0"
        }
    }
    fun decclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output=="0"){
            textView.text = "."
        }
        else {
            textView.text = output + "."
        }
    }

    fun addclicked(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        val output: String=textView.text.toString()
        if(output.isNotEmpty()){
            firstNumber=output.toInt()
            isadd=true
            textView.text="0"
        }

    }
