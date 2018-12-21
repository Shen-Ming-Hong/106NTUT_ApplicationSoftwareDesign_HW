 private void changeSettings() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

        final String[] settingList = {"選項1" , "選項2" , "選項3"};

        alertDialog.setTitle("標題");
        alertDialog.setItems(settingList, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, final int which) {

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
				
				switch(which){
					case 0:
						break;
					case 1:
						break;
					case 2:
						break;
				};
                alertDialog.show();
            }
        });
        alertDialog.show();
    }