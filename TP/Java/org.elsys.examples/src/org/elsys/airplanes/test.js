	xtype: 'gridpanel',
    store: yourStore,
    title:'Panel title',
    columns: [{
    	id : 'column1Id',
        text : 'Column1 name',
        dataIndex: 'col1', //data intex from model
        editor: new Ext.form.field.ComboBox({
        	id: 'editor1Id',
        	triggerAction: 'all',
        	store:  new Ext.data.JsonStore({
        		storeId : 'store1Id',
        		proxy : {
        			type : 'ajax',
        			url : 'getData.php',
        			extraParams: {
        				start: 0,
        				limit: 40,
        			},
        			reader : {
        				type : 'json',
        				root : 'response',
        				idProperty : 'id',
        				totalProperty : 'total',
        			}
        		},
        		fields : [ 'id', 'data' ],
        		autoload : true,        			}),
            	displayField: 'data',
            	valueField: 'id',
            	editable: false,
        })
    } , {
    	id : 'col2Id',
        text : 'Col2 name',
        dataIndex: 'col2',
    	 editor: new Ext.form.field.ComboBox({
    		 id: 'editor2Id',
    	     triggerAction: 'all',
    	     store: new Ext.data.JsonStore({
    	    	 storeId : 'store2Id',
    	    	 proxy : {
    	    		 type : 'ajax',
    	    		 url : 'getData2.php',
    	    		 extraParams: {
    	    			 start: 0,
    	    			 limit: 80,
    	    		 },
    	    		 reader : {
    	    			 type : 'json',
    	    			 root : 'response',
    	    			 idProperty : 'id',
    	    			 totalProperty : 'total',
    	    		 }
    	    	 },
    	    	 fields : [ 'id', 'data' ],
    	    	 autoload : true,
    	     }),
    	     displayField: 'data',
    	     valueField: 'id',
    	     editable: false,
    	 })
    }],
    selModel: {
    	selType: 'cellmodel'
    },
    tbar: [{
    	text: 'Button new text',
    	handler : function() {
    		var r = Ext.create('Model', {
    			editor1Id: 'Editor 1 default value', 
    			editor2Id: 'Editor 2 default value',
    		});
    		cellEditing.startEditByPosition({row: 0, column: 0});
    		yourStore.insert(0, r);
    		Ext.getCmp('your-grid-id').on('edit', function(editor, e) {
	        // set correct field values else departmentId and
			// positionId are not defined
    			yourStore.data.items[e.rowIdx].data.fieldName = editor.editors.items[0].field.value;
    			yourStore.data.items[e.rowIdx].data.fieldName = editor.editors.items[1].field.value;
	        });
    	}
    },{
    	text : 'Button delete text',
    	handler : function(){
    		var r = Ext.getCmp('your-grid-id').getSelectionModel();
    	    if(r.selected.length) {
    	    	var employmentGrid = Ext.getCmp('your-grid-id');
    	    	yourStore.removeAt(yourStore.getSelectionModel().selection.row);
    	    }
    	} 
    }],
    plugins: [cellEditing]